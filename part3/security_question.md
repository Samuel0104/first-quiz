Como se tienen doce ingenieros de software con acceso total al sistema, se pueden presentar fallas en el software debido a alteraciones no controladas en el código. En este caso, buscaría mantener un proceso de revisión para que siempre haya una confirmación conjunta antes de realizar cualquier actualización.

Ahora, por el lado de atención al cliente, los tres empleados pueden ver los datos y realizar cambios en las cuentas. Esto podría permitir inyecciones en la base de datos MySQL a través de vulnerabilidades típicas de la API como consultas que reciban archivos JSON como contenido. Con este posible riesgo, lo mejor sería restringir cualquier consulta dinámica o implementar las validaciones para entradas de datos. Además, es claro que no hay necesidad de que datos como las contraseñas sean visibles para los trabajadores, por lo que estos deberían ser cifrados.