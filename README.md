# SpringCoreDemo

## Overview
This project demonstrates the core concepts of the Spring Framework, focusing on Inversion of Control (IoC) and Dependency Injection (DI). The Spring Framework is a comprehensive framework for developing Java applications, providing a model for configuration and programming.

## Spring Framework
Spring is known as a framework of frameworks. It provides a comprehensive programming and configuration model for modern Java-based enterprise applications. The primary goal of Spring is to handle infrastructure so that developers can focus on business logic.

### Key Features
1. **IoC (Inversion of Control)**
2. **DI (Dependency Injection)**

### Inversion of Control (IoC)
- **Definition**: IoC is the process of transferring the control of object creation and lifecycle management from the application code to the Spring container.
- **Purpose**: It allows the Spring container to manage the creation and lifecycle of objects, making the code more modular and easier to maintain.

### Dependency Injection (DI)
- **Definition**: DI is the process of injecting one object into another as a dependency.
- **Purpose**: It allows objects to be injected into other objects without using the `new` keyword, promoting loose coupling and easier testing.

## Bean Configuration
There are two ways to configure beans in Spring:
1. **XML-based Configuration**
2. **Annotation-based Configuration**

### XML-based Configuration
In XML-based configuration, beans are defined in an XML file (e.g., `springDI.xml`). The XML file contains bean definitions, specifying the class and properties of the beans.

#### Example
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
    
    <!-- Bean Definition -->
    <bean id="car-bean" class="com.jsp.springcore.DI.Car">
        <property name="engine" ref="engine-bean"></property>
    </bean>
    
    <bean id="engine-bean" class="com.jsp.springcore.DI.Engine"></bean>
</beans>
```

## BeanFactory
- **Definition**: BeanFactory is a basic container that provides fundamental features for managing bean objects.
- **Characteristics**: It is a lazy loader, creating objects only when requested via the `getBean()` method. This makes it memory efficient compared to `ApplicationContext`.

## Types of Dependency Injection
1. **Setter Injection**
   - Uses the `<property>` tag in the XML configuration.
   - Requires setter methods and a default constructor in the bean class.
2. **Constructor Injection**
   - Uses the `<constructor-arg>` tag in the XML configuration.
   - Requires a parameterized constructor in the bean class.

## Conclusion
This project provides a basic understanding of the Spring Framework's core concepts, including IoC and DI, and demonstrates how to configure beans using XML-based configuration.

## Notes

### IoC (Inversion of Control)
- **Stands for**: Inversion of Control.
- **Description**: The process of inverting the control of object creation and lifecycle management from the developer to the Spring container.
- **Core Principle**: Spring IoC handles the creation and management of objects and their dependencies.

### DI (Dependency Injection)
- **Description**: Injecting one object inside another as a dependency.
- **Purpose**: Allows injecting one class object inside another without using the `new` keyword, but by taking the object from the Spring bean container.
- **Requirement**: Both class objects must be handled by the Spring Container.

### Bean Configuration Methods
1. **XML-based Configuration**: Uses an XML file to configure beans.
2. **Annotation-based Configuration**: Uses annotations to configure beans.

### BeanFactory Interface
- **Package**: `org.springframework.beans.factory`
- **Description**: A basic container that provides fundamental features for managing bean objects.
- **Lazy Loader**: Creates objects only when requested via `getBean()`, making it memory efficient.

### Types of Dependency Injection
1. **Setter Injection**:
   - Uses `<property>` tag with `name` and `ref` attributes.
   - Requires setter methods and a default constructor in the bean class.
2. **Constructor Injection**:
   - Uses `<constructor-arg>` tag with `name` and `ref` attributes.
   - Requires a parameterized constructor in the bean class.
