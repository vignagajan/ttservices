# Microservices Based Trading Platform

## Table of Contents
- [Introduction](#introduction)
- [System Architecture](#system-architecture)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Reference](#reference)

## Introduction

This project serves as a an micorservices trading platform. It consists of differnet microserivces from user management to message passing  and finally to data streaming, utilizing a robust tech stack that includes Java, Spring Boot, Spring Cloud, Apache Khafka, and  PostgreSQL. Everything is containerized using Docker for ease of deployment and scalability.

## System Architecture

![System Architecture](https://user-images.githubusercontent.com/40702606/144061535-7a42e85b-59d6-4f7f-9c35-18a48b49e6de.png)

The project is designed with the following components:

- **Spring Boot**: Backend of the webservices
- **Spring Cloud**:  Extends the capabilities of Spring Boot to provide tools and services for building and deploying microservices in a distributed system.
- **Apache Kafka**: Distributed streaming platform for event-driven communication and message handling between microservices.

## Progress

[x] Microservices Architecture Design
[x] User Management Implementation
[x] Message Passing Microservice
[x] Data Streaming Microservice
[x] Docker Containerization
[] Integration Testing & Deployment Setup

## Technologies

- Java
- Spring Boot
- Spring Cloud
- Apache Khafka
- PostgreSQL
- Docker
- Kubernetes

## Getting Started

1. Clone the repository:
    ```bash
    git clone https://github.com/vignagajan/ttservices.git
    ```

2. Navigate to the project directory:
    ```bash
    cd ttservices
    ```

3. Run Docker Compose to spin up the services:
    ```bash
    docker-compose up
    ```

## Reference

Check out [YouTube Video](https://www.youtube.com/watch?v=1aWhYEynZQw).
