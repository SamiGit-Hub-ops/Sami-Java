Microservices: In the industry, Java for microservices-based development refers to using the Java programming language to build applications following 
the microservices architecture. Microservices architecture breaks down a large application into smaller, independent services, each responsible
for a specific business function. These services communicate with each other over a network, often using lightweight protocols like HTTP/REST.

Java is a popular choice for microservices because of its platform independence, robustness, and rich ecosystem. 
The Java Virtual Machine (JVM) allows microservices to run consistently across different environments. 
Java frameworks such as Spring Boot simplify creating microservices by providing tools to build, deploy,
and manage these small services efficiently. This approach enables faster development, easier maintenance, 
and better scalability compared to traditional monolithic applications.

Monolith: The entire application is built, tested, and deployed as one single codebase and file. Fast to build and simple to deploy. If one part 
crashes (e.g., the payment checkout page), the entire app goes down.

The modern industry trend is 'Monolith First.' Companies start with a well-structured Monolith to move fast, 
and only break out into Microservices when a specific feature faces massive traffic or requires a dedicated team

If a company serves billions of users worldwide and has thousands of independent product features, it physically cannot run on a simple monolith.
If it manages global, multi-region web traffic and operates a wide range of distinct features they must rely on a highly distributed, 
microservices-based runtime to isolate traffic and handle independent scaling.
Every tech giant deals with shared code, like logging systems, identity authentication, or security libraries.
They won't write this from scratch for every service.

Hoowever, to avoid the massive version mismatch issues that plague large distributed networks, they probably utilize a Monolithic repo or centralized shared packages. 
This allows them to maintain a single source of truth for their core libraries while keeping their production deployments isolated.

TLDR : 
Code storage : One repo
Deployment : Millions of tiny, independent, distributed services through orchestrators
