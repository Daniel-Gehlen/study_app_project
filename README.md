# StudyApp - Android Learning Application

## Overview

This project is an Android-based learning application that allows users to study lessons, hear automated voice narration of the content, and take quizzes at the end of each section. After completing all lessons in a course, users can take an exam and, if they pass, unlock the next course level. Upon completing all levels, users can download a certificate of participation. 

The app also features:
- Dark mode.
- Timed quizzes and exams.
- Progress tracking.
- Ads (removed when the course is purchased).

## Technologies Used

### 1. **Kotlin**
   - The primary programming language for Android development.
   - Used for building the business logic and UI interaction within the app.

### 2. **Android SDK**
   - Provides APIs for interacting with Android hardware, UI components, and system services.
   - Contains tools for developing, testing, and debugging Android applications.

### 3. **Text-to-Speech API**
   - Enables automated voice narration of lessons.
   - Converts text content into audible speech as the user interacts with the lesson.

### 4. **Jetpack ViewBinding**
   - A feature for simplifying UI interactions in Kotlin by generating binding classes for XML layout files.
   - Reduces the need for `findViewById()` calls.

### 5. **XML Layouts**
   - Defines the user interface elements for the app.
   - Used to create layouts for activities such as lesson pages, quizzes, and exams.

### 6. **Gradle**
   - The build system for managing dependencies, compiling the project, and packaging the app for distribution.
   - Configures the project’s structure and build process.

## Project Directory Structure

```
study_app_project/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── example/
│           │           └── studyapp/
│           │               └── activities/
│           │                   ├── MainActivity.kt
│           │                   ├── StudyActivity.kt
│           │                   ├── QuestionActivity.kt
│           │                   ├── ExamActivity.kt
│           │                   └── CertificateActivity.kt
│           └── res/
│               └── layout/
│                   ├── activity_main.xml
│                   ├── activity_study.xml
│                   ├── activity_question.xml
│                   ├── activity_exam.xml
│                   └── activity_certificate.xml
│
├── build.gradle
└── Dockerfile
```



### **Key Files:**

1. **MainActivity.kt**: Launches the application and handles the main screen where the user starts the study process.
2. **StudyActivity.kt**: Manages the content display and text-to-speech narration.
3. **QuestionActivity.kt**: Displays multiple-choice questions at the end of each section.
4. **ExamActivity.kt**: Handles the final exam logic with a timer and score calculation.
5. **CertificateActivity.kt**: Manages the download or sharing of the course completion certificate.
6. **XML Layout Files**: Define the UI components for each activity.

## Code Naming Conventions

- **Classes and Activities**: Use `PascalCase` (e.g., `MainActivity`, `StudyActivity`).
- **Variables and Methods**: Use `camelCase` (e.g., `readText`, `nextButton`).
- **Resource IDs**: Use `snake_case` (e.g., `@+id/next_button`, `@+id/question_text_view`).
- **Layouts**: Follow the `activity_name.xml` format to clearly identify layouts tied to specific activities.

## Setting Up the Development Environment

### Prerequisites

- **Android Studio**: The official IDE for Android development. You can download it from [here](https://developer.android.com/studio).
- **JDK 11 or higher**: Required for Kotlin and Android development. Ensure that it is installed and properly configured in your environment.
- **Android SDK**: Install via Android Studio's SDK Manager.

### Steps to Configure the Project

1. **Clone the Project**
   ```bash
   git clone https://github.com/your-repo/study_app_project.git
   cd study_app_project
   ```

2. **Open the Project in Android Studio**

- Open Android Studio.
- Select File > Open and navigate to the study_app_project folder.
- Allow Android Studio to sync the project and download necessary dependencies.

3. **Set Up Gradle**

- Gradle should automatically sync when the project is opened.
- Ensure the appropriate Android SDK is installed by going to File > Project Structure > SDK Location.

4. **Run the Application**

- Select a device or an emulator in Android Studio.
- Click the Run button or press Shift+F10 to build and run the project.

5. **Add Your Content**

- To add your own lessons or questions, modify the content within StudyActivity.kt and QuestionActivity.kt.

6. **Configure Ads and In-App Purchases**

- To integrate ads or manage in-app purchases, you’ll need to modify the MainActivity.kt and add relevant SDKs (like AdMob).
- In-app purchases can be configured using Google Play Billing Library.

7. **Dockerfile**

- After creating the Dockerfile, you can build the Docker image and run it as needed

```
docker build -t android-native-image .
docker run -it --rm -v $(pwd):/workspace android-native-image
```

### Additional Tips

- Dark Mode: Ensure that dark mode is supported by updating your XML layout files with night variants for colors and styles.
- Testing: Use Android Studio's built-in emulator or connect a physical device for testing. Ensure to test both the free version with ads and the paid version without ads.
- Certificate Generation: To implement certificate generation, explore PDF generation libraries in Android (e.g., iText or PdfDocument)

#### Resume

Native Android project featuring multiple activities and layouts for a study app, including main, study, question, exam, and certificate views. 
Configured with Android SDK and JDK.