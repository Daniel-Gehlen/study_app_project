# Use the base Gitpod image
FROM gitpod/workspace-full

USER root

# Update package list and install required packages
RUN apt-get update && apt-get install -y --no-install-recommends \
    openjdk-11-jdk-headless \
    wget \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Install Android SDK command line tools
RUN wget -q https://dl.google.com/android/repository/commandlinetools-linux-8512546_latest.zip -O /tmp/cmdline-tools.zip \
    && mkdir -p /android-sdk/cmdline-tools \
    && unzip /tmp/cmdline-tools.zip -d /android-sdk/cmdline-tools \
    && rm /tmp/cmdline-tools.zip

# Set environment variables for Android SDK
ENV ANDROID_SDK_ROOT="/android-sdk"
ENV PATH="${PATH}:${ANDROID_SDK_ROOT}/cmdline-tools/cmdline-tools/bin"

# Create a symbolic link to ensure sdkmanager is accessible
RUN ln -s /android-sdk/cmdline-tools/cmdline-tools/bin/sdkmanager /usr/local/bin/sdkmanager

# Install Android SDK packages
RUN sdkmanager --update \
    && sdkmanager --licenses \
    && sdkmanager "platform-tools" "platforms;android-30" "build-tools;30.0.3"

USER gitpod

# Set workspace directory
WORKDIR /workspace
