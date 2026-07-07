<div align="center">

# 📦 Expiration Tracker

### A multi-profile desktop app for tracking product expiration dates

![Status](https://img.shields.io/badge/status-in%20progress-yellow)
![Java](https://img.shields.io/badge/Java-21%20(Temurin)-orange?logo=openjdk)
![JavaFX](https://img.shields.io/badge/JavaFX-21-blue)
![SQLite](https://img.shields.io/badge/Database-SQLite-lightgrey?logo=sqlite)
![Build](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven)
![License](https://img.shields.io/badge/license-Personal%20Project-lightgrey)

**Timeline:** July 6 – September 10, 2026 · 7 days a week · no days off
**Developer:** FABLE (solo project) · 🐧 Linux
**Last updated:** July 6, 2026

</div>

---

## 📖 Table of Contents

- [Project Overview](#-project-overview)
- [Tech Stack](#-tech-stack)
- [Solo Ownership](#-solo-ownership)
- [Current Status](#-current-status)
- [Roadmap](#-roadmap-phases-0-7)
- [Feature Set](#-feature-set)
- [Data Structures Covered](#-data-structures-covered)
- [Definition of Success](#-definition-of-success)
- [Next Steps](#-immediate-next-steps)

---

## 🧭 Project Overview

**Expiration Tracker** is a desktop application that helps users track product expiration dates before they go bad. It's built to serve **three distinct user profiles**, each with different needs but sharing the same core engine.

| Profile | Use Case |
|---|---|
| 🏠 **Personal / Individual** | Tracking food and household items at home |
| 🏪 **Convenience Store** | Small-scale retail inventory, faster turnover, higher item counts |
| 🍕 **Domino's Pizza Location** | Perishable ingredient tracking for daily prep & delivery cycles |

> The three-profile design keeps the core data model and services generic, while UI, defaults, and workflows adapt per profile.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| **Language** | Java 21 (Temurin distribution) |
| **GUI Framework** | JavaFX 21 |
| **Database** | SQLite via JDBC |
| **Build Tool** | Maven |
| **OCR Pipeline** | Python 3 + `pytesseract` + `Pillow`, backed by the Tesseract OCR engine |
| **Version Control** | Git + GitHub (SSH authentication) |
| **IDE** | IntelliJ IDEA Community 2024.3 |

**IntelliJ Plugins:** `.ignore` · `GitToolBox` · `JavaFX Support`

---

## 🧑‍💻 Solo Ownership

| Person | Platform | Responsibility |
|---|---|---|
| **FABLE** | 🐧 Linux | Full stack — `InventoryService`, UI, database layer, testing, integration, OCR pipeline |

This is a one-person project. All development, testing, and integration work runs through a single Maven project on Linux, with a standard Git workflow and SSH-authenticated GitHub access.

---

## ✅ Current Status

**As of July 6, 2026**

- [x] GitHub repository created

**Still open from Phase 0:**

- [ ] Install & verify Java 21 (Temurin)
- [ ] Generate SSH keys + connect to GitHub over SSH
- [ ] Install IntelliJ plugins (`.ignore`, `GitToolBox`, `JavaFX Support`)
- [ ] Set up Maven project folder structure
- [ ] Design the `Product` model
- [ ] Design the database schema
- [ ] Create UI sketches

> 📅 The schedule has been restarted from today's date, restructured around a **uniform 2-hour session every day of the week**, running through the original final deadline of **September 10, 2026**.

---

## 🗺️ Roadmap (Phases 0–7)

<table>
<tr><th>Phase</th><th>Dates</th><th>Focus</th><th>Key Deliverable</th></tr>

<tr>
<td><b>0</b><br/>Fundamentals, Planning & Setup</td>
<td>Jul 6 – Jul 13</td>
<td>Core programming review, Git/GitHub practices, Arrays & ArrayLists, project planning</td>
<td>Working dev environment, Product model, DB design, UI mockups</td>
</tr>

<tr>
<td><b>1</b><br/>Console Application Prototype</td>
<td>Jul 14 – Jul 24</td>
<td>Add/View/Edit/Delete Product, categories, quantity & expiration tracking</td>
<td>Fully functional terminal-based application</td>
</tr>

<tr>
<td><b>2</b><br/>Database Integration</td>
<td>Jul 25 – Jul 31</td>
<td>SQLite persistence, SQL basics, database design</td>
<td>Data survives a restart</td>
</tr>

<tr>
<td><b>3</b><br/>GUI Development</td>
<td>Aug 1 – Aug 12</td>
<td>JavaFX dashboard, product table/forms, search, filters, navigation</td>
<td>Functional desktop interface</td>
</tr>

<tr>
<td><b>4</b><br/>Tracking, Search, Sort & Notifications</td>
<td>Aug 13 – Aug 19</td>
<td>Days-remaining calc, HashMap lookups, Comparator-based sorting, notifications</td>
<td>Fully functional expiration tracking system</td>
</tr>

<tr>
<td><b>5</b><br/>Core Completion & Optimization<br/><sub>🎯 Target Completion Deadline</sub></td>
<td>Aug 20 – Aug 26</td>
<td>UI polish, bug fixes, refactoring, Priority Queue for soonest-expiring items</td>
<td>Stable, usable application</td>
</tr>

<tr>
<td><b>6</b><br/>OCR & Advanced Features<br/><sub>🚩 Feature-Complete Deadline</sub></td>
<td>Aug 27 – Sep 3</td>
<td>Receipt upload/OCR, product extraction, Set-based de-duplication</td>
<td>Working receipt-scanning functionality</td>
</tr>

<tr>
<td><b>7</b><br/>Finalization & Presentation<br/><sub>🏁 Final Absolute Deadline</sub></td>
<td>Sep 4 – Sep 10</td>
<td>Testing, documentation, README, packaging, demo video, code review</td>
<td>Final polished, portfolio-ready application</td>
</tr>

</table>

---

## 🎯 Feature Set

<table>
<tr valign="top">
<td>

### 🟢 Core
- Add / Edit / Delete Products
- Product Categories
- Search Products
- Sort Products
- Expiration Tracking
- Expiration Notifications
- SQLite Database
- Dashboard

</td>
<td>

### 🟡 Stretch
- Receipt OCR
- Automatic Product Extraction
- Better Analytics
- Better Dashboard

</td>
<td>

### 🔵 Future
- QR Code Generation
- QR Code Scanning
- AI Expiration Suggestions
- Cloud Synchronization
- Mobile Application

</td>
</tr>
</table>

---

## 🧩 Data Structures Covered

| Data Structure | Where It's Used |
|---|---|
| **Array / ArrayList** | Phase 1 — core product storage, traversal, linear search |
| **HashMap / Dictionary** | Phase 4 — fast product & category lookup |
| **Set** | Phase 6 — de-duplicating OCR-extracted products |
| **Priority Queue** | Phase 5 — surfacing soonest-expiring products |
| **Sorting Algorithms** | Phase 4 — Comparator-based sort by date, name, category, quantity |
| **Searching Algorithms** | Phase 1 & 4 — linear search, indexed lookup |
| **Big-O Analysis** | Phase 0 — foundational concept review |

---

## 🏆 Definition of Success

By the end of the project, a user should be able to:

- [ ] Launch the application
- [ ] Add, edit, and delete products
- [ ] Save and search inventory
- [ ] Sort inventory
- [ ] Track expiration dates
- [ ] Receive notifications
- [ ] Scan receipts
- [ ] Have products automatically extracted from a scanned receipt

> Achieving this means hands-on experience with: programming fundamentals, OOP, data structures, databases, GUI development, Git/GitHub workflows, OCR integration, software design, and a complete real-world project lifecycle — from idea to finished, portfolio-ready product.

---

## 🔜 Immediate Next Steps

1. Install and verify Java 21 (Temurin)
2. Generate SSH keys and connect to GitHub over SSH
3. Install IntelliJ plugins: `.ignore`, `GitToolBox`, `JavaFX Support`
4. Set up the Maven project folder structure
5. Design the `Product` model and database schema
6. Sketch the initial UI screens

---

<div align="center">

*This document is maintained alongside the project and updated as phases progress.*

</div>
