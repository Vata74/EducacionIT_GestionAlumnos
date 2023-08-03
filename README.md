# Sistema de Gestión Académica

Este es un sistema de gestión académica desarrollado en Java para administrar información relacionada con alumnos, asignaturas, profesores y trámites académicos. El sistema permite llevar un registro de las inscripciones de asignaturas, el historial académico de los alumnos, la gestión de profesores y trámites, así como detalles de las carreras ofrecidas.

## Clases Principales

### `Alumno`
La clase `Alumno` representa a un estudiante en el sistema. Cada instancia de esta clase tiene información sobre el alumno, como su identificación, materias inscritas, trámites, historial académico y carrera.

- **Atributos:**
  - `Id_Alumno`: Identificación del alumno.
  - `Materias`: Lista de asignaturas inscritas por el alumno.
  - `Carrera`: Carrera en la que está inscrito el alumno.
  - `Tramites`: Lista de trámites académicos iniciados por el alumno.
  - `HistorialAcademico`: Lista de asignaturas cursadas por el alumno con sus notas.

- **Métodos:**
  - `inscribirMateria(Asignatura asignatura)`: Inscribe una asignatura para el alumno.
  - `iniciarTramite(Tramite tramite)`: Inicia un trámite académico para el alumno.
  - `inscribirCarrera(Carrera carrera)`: Asigna una carrera al alumno.

### `Asignatura`
La clase `Asignatura` representa una materia ofrecida en el sistema. Cada instancia de esta clase contiene detalles como el nombre, tipo, horas de clase, cuatrimestre y profesores asignados.

- **Atributos:**
  - `Nombre`: Nombre de la asignatura.
  - `Tipo`: Tipo de la asignatura (obligatoria, optativa, etc.).
  - `Horas`: Horas de clase por semana.
  - `Cuatrimestre`: Número de cuatrimestre en el que se ofrece la asignatura.
  - `Profesores`: Lista de profesores que imparten la asignatura.

- **Métodos:**
  - `agregarProfesor(Profesor profesor)`: Asigna un profesor a la asignatura.

### `AsignaturaCursada`
La clase `AsignaturaCursada` representa una asignatura que un alumno ha cursado. Almacena detalles sobre el alumno, la asignatura y las calificaciones obtenidas.

- **Atributos:**

  - `Alumno`: Alumno que cursó la asignatura.
  - `Nota`: Nota obtenida por el alumno en la asignatura.
  - `Asignatura`: Asignatura cursada.
  - `Final`: Calificación del examen final.

- **Métodos:**

  - `registrarNota(double nota, double ExamenFinal)`: Registra la nota obtenida por el alumno y la calificación del examen final.

### `Carrera`
La clase `Carrera` representa una carrera académica ofrecida por la institución. Cada instancia contiene información sobre las asignaturas asociadas y los profesores que participan en esa carrera.

- **Atributos:**

  - `Nombre`: Nombre de la carrera.
  - `Sede`: Sede en la que se ofrece la carrera.
  - `Asignaturas`: Lista de asignaturas que forman parte de la carrera.
  - `Profesores`: Lista de profesores involucrados en la carrera.

- **Métodos:**

  - `agregarAsignatura(Asignatura asignatura)`: Agrega una asignatura a la carrera.
  - `agregarProfesor(Profesor profesor)`: Agrega un profesor a la carrera.

### `Persona`

La clase `Persona` representa a una persona genérica en el sistema. Las clases Alumno y Profesor heredan de esta clase. Contiene información básica como DNI, nombre y dirección.

### `Profesor`

La clase `Profesor` hereda de `Persona` y representa a un profesor en el sistema. Cada instancia de esta clase contiene información sobre el profesor, como su identificación, departamento y detalles personales.

### `Tramite`

La clase `Tramite` representa un trámite académico realizado por un alumno. Almacena detalles como el número de trámite, la fecha, el alumno involucrado y el estado del trámite.

## Uso del Sistema

El archivo `Main.java` contiene el método `main` que demuestra cómo se utilizan las clases para simular la interacción en el sistema de gestión académica. Se crea una serie de objetos, se registran asignaturas, se inscriben alumnos y se realizan trámites, entre otras acciones.

## Ejecución

Para ejecutar el programa, asegúrate de tener un entorno de desarrollo Java configurado. Luego, compila y ejecuta el archivo `Main.java` para observar la funcionalidad del sistema de gestión académica.
