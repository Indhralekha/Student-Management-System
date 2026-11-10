
import { useState } from "react";
import "./App.css";

function App() {
  const [students, setStudents] = useState([]);
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [department, setDepartment] = useState("");

  function addStudent(e) {
    e.preventDefault();

    if (!name || !email || !department) {
      alert("Please fill all fields");
      return;
    }

    const student = {
      id: Date.now(),
      name,
      email,
      department
    };

    setStudents([...students, student]);
    setName("");
    setEmail("");
    setDepartment("");
  }

  function deleteStudent(id) {
    setStudents(students.filter(s => s.id !== id));
  }

  return (
    <div className="container">
      <h1>Student Management System</h1>
      <p>Manage your student records</p>

      <div className="form-box">
        <h2>Add New Student</h2>

        <form onSubmit={addStudent}>
          <input
            placeholder="Student Name"
            value={name}
            onChange={e => setName(e.target.value)}
          />

          <input
            type="email"
            placeholder="Student Email"
            value={email}
            onChange={e => setEmail(e.target.value)}
          />

          <input
            placeholder="Department"
            value={department}
            onChange={e => setDepartment(e.target.value)}
          />

          <button type="submit">Add Student</button>
        </form>
      </div>

      <div className="table-box">
        <h2>Student List</h2>

        <table>
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Email</th>
              <th>Department</th>
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {students.map(s => (
              <tr key={s.id}>
                <td>{s.id}</td>
                <td>{s.name}</td>
                <td>{s.email}</td>
                <td>{s.department}</td>
                <td>
                  <button
                    className="delete-btn"
                    onClick={() => deleteStudent(s.id)}
                  >
                    Delete
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>

        {students.length === 0 && <p>No students added yet.</p>}
      </div>
    </div>
  );
}

export default App;
