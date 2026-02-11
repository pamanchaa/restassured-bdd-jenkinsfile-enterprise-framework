pipeline {  
    agent any  
    parameters {  
        choice(name: 'ENVIRONMENT', choices: ['dev', 'qa', 'staging', 'prod'], description: 'Select the environment for deployment')  
        string(name: 'EMAIL', defaultValue: 'user@example.com', description: 'Email for notifications')  
    }  
    stages {  
        stage('Build') {  
            steps {  
                echo "Building for environment: ${ENVIRONMENT}"  
                // Add build steps here  
            }  
        }  
        stage('Test') {  
            steps {  
                echo "Running tests for environment: ${ENVIRONMENT}"  
                // Add test execution steps here  
            }  
        }  
        stage('Report Generation') {  
            steps {  
                echo "Generating report for environment: ${ENVIRONMENT}"  
                // Add report generation steps here  
            }  
        }  
    }  
    post {  
        success {  
            echo 'Build completed successfully!'  
            mail to: "${EMAIL}",  
                 subject: "Build Successful: ${ENVIRONMENT}",  
                 body: "The build for environment ${ENVIRONMENT} was successful."  
        }  
        failure {  
            echo 'Build failed!'  
            mail to: "${EMAIL}",  
                 subject: "Build Failed: ${ENVIRONMENT}",  
                 body: "The build for environment ${ENVIRONMENT} has failed."  
        }  
    }  
}