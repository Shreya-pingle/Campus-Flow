# 3-hour CampusFlow interview preparation plan

## 0:00–0:25 — Understand the flow
- Read the architecture and feature-to-code table in README.
- Memorize: React → REST API → Spring service → JPA → MySQL.
- Explain GET, POST, PUT, DELETE in one sentence each.

## 0:25–1:05 — Spring Boot + database
- Open `Task.java`, `TaskRepository.java`, `TaskService.java`, `TaskController.java`.
- Understand: `@Entity`, `@Id`, `@GeneratedValue`, `JpaRepository`, `@RestController`, `@GetMapping`, `@PostMapping`.
- Say: “Controller receives HTTP request; service contains business logic; repository talks to database.”

## 1:05–1:35 — JWT + roles
- Read `AuthController`, `JwtService`, `JwtFilter`, `SecurityConfig`.
- Flow: login credentials → signed token → frontend stores token → sends Bearer token → filter validates token → Spring Security creates authenticated user with role → admin route checks ADMIN.
- Be honest: demo user is hard-coded; production would use database users + BCrypt.

## 1:35–2:20 — Five data structures
- Priority Queue: heap; HIGH rank 0, MEDIUM 1, LOW 2.
- Graph: edge A → B means B depends on A; reject B → A if A already reaches B.
- Trie: walk prefix characters, then collect words below that node.
- Stack: last action is first undone; redo stack stores undone actions.
- LRU: access-order LinkedHashMap moves recently used entries to the end and evicts the oldest.

## 2:20–2:40 — React
- Read `frontend/src/App.jsx`.
- Understand `useState`, `useEffect`, `fetch`, JSON, Authorization header.
- Explain that React state controls the displayed task list and API calls load/create/delete tasks.

## 2:40–3:00 — GitHub and speaking practice
- Run the app if possible; otherwise do not claim it was run.
- Push the project to a public repository.
- Practice the 60-second explanation below and answer “why this data structure?” questions.

## 60-second explanation
“CampusFlow is a full-stack task management application. I used React for the user interface and Spring Boot REST APIs for the backend. Tasks are persisted in MySQL using Spring Data JPA. JWT is used to authenticate API requests, and Spring Security checks the role for admin-only routes. I used a priority queue to select important tasks, a graph to represent dependencies and prevent cycles, a trie for prefix autocomplete, two stacks for undo/redo, and an LRU cache for recently viewed tasks. I kept each component small and separate so it is easy to test and extend.”
