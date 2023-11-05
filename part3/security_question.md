Basandome en el top 10 de OWASP, expongo las siguientes consideraciones
para que el sistema sea mas seguro.

En primer lugar, es ideal implementar una autenticación sólida y manejo seguro de sesiones para
la aplicación móvil, front-end y back-end. Esto también va en conjunto con el aseguramiento  de los
datos sensibles de los clientes (contraseñas,números de teléfono) mediante encriptación. Además,
 se debe dotar de un control de acceso adecuado para distintos roles de la empresa (Ingeniera de software, atención al cliente y ventas), asegurandose que solo tengan acceso a los datos y funciones
 especificos a su rol. 

 Por otra parte, la revisión de la configuración de seguridad de los contenedores Kubernetes y AWS, es importante, esto evita problemas de seguridad que puedan ser explotadas debido a configuraciones erroneas. También, es importante poner en práctica un registro y monitoreo de la infraestructura para
 detectar cualquier actividad sospechosa lo antes posible. A grandes rasgos estos son algunos aspectos a considerar los cuales más adelante requerirán un plan detallado y medidas especificas para abordarlos adecuamente. 