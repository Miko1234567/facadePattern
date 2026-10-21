# Assignment #4 — Facade Pattern (Media Conversion)

## Course Details
* **Course:** ShP-2216 – Software Design Patterns (OP 6B06102)
* **Student:** Meiirbek Reim (Group: SE-2541, Astana IT University)
* **Type:** Individual Assignment (15% of 2nd Attestation)

---

## 1. Project Overview
This project implements the **Facade structural design pattern** in Java (JDK 17). It provides a simplified, unified interface (`MediaConversionFacade`) that coordinates a complex subsystem for media file processing without exposing internal implementation details to the client.

---

## 2. Project Architecture & Subsystem Classes
The project consists of the following components:
* **`MetadataReader`**: Reads raw file metadata (duration, format, resolution).
* **`CodecFactory`**: Detects and extracts appropriate video/audio codecs based on the target format.
* **`BitrateReader`**: Reads and buffers data streams according to specific bitrates.
* **`AudioMixer`**: Finalizes audio tracks and outputs the converted media file.
* **`MediaConversionFacade`**: Wraps the subsystem classes and exposes a single simplified method (`convertVideo`).
* **`Main`**: The client application that interacts exclusively with the Facade.

---

## 3. Clean Code Principles Applied
1. **Meaningful Names:** Classes and methods use self-explanatory names that clearly state their purpose.
2. **Single Responsibility Principle (SRP):** The Facade only coordinates execution steps, while subsystem classes handle specific low-level logic.
3. **Encapsulation / Information Hiding:** The Facade public interface hides complex subsystem initialization and orchestration details from the client.
4. **Small, Focused Classes:** Each subsystem class maintains a single, well-defined responsibility.
5. **Decoupling:** Subsystem classes remain unaware of the Facade's existence and can still be used directly by advanced clients if needed.

---

## 4. How to Run
1. Open the project in **IntelliJ IDEA**.
2. Navigate to `src/Main.java`.
3. Click the green **Run** button next to the `main` method to see the conversion process in the console.
