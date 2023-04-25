package com.example.staff_monitoring_system;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class help extends AppCompatActivity {
    private Spinner helpSpinner;
    private TextView helpContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


                // Initialize the Spinner and TextView
                helpSpinner = findViewById(R.id.help_spinner);
                helpContent = findViewById(R.id.help_content);

                // Create an array of help topics
                String[] helpTopics = {"Getting Started", "Features", "Settings", "Troubleshooting", "FAQs", "Contact Support", "Terms of Service and Privacy Policy"};

                // Create an ArrayAdapter and set it as the adapter for the Spinner
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, helpTopics);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                helpSpinner.setAdapter(adapter);

                // Set an OnItemSelectedListener for the Spinner
                helpSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String topic = parent.getItemAtPosition(position).toString();
                        String content = getHelpContent(topic);
                        helpContent.setText(content);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // Do nothing
                    }
                });
            }

            private String getHelpContent(String topic) {
                switch (topic) {
                    case "Getting Started":
                        return "how to register into app for student\n" +
                                "\n" +
                                "The process of registering for an app as a student can vary depending on the app and the device you are using, but here are some general steps you can follow:\n" +
                                "\n" +
                                "Download the app: Find the app on your device's app store and download it.\n" +
                                "\n" +
                                "Open the app: Once the app is downloaded, open it on your device.\n" +
                                "\n" +
                                "Click on \"Register\" or \"Sign Up\": Look for a \"register\" or \"sign up\" button within the app and click on it.\n" +
                                "\n" +
                                "Enter your information: You will typically need to provide your full name, email address, and create a password. Some apps may also ask for additional information such as your school name, student ID number, or date of birth.\n" +
                                "\n" +
                                "Verify your email address: Some apps may require you to verify your email address before you can use the app. Check your email inbox for a verification email from the app and follow the instructions to verify your email address.\n" +
                                "\n" +
                                "Complete registration: Once you have entered all of the required information and verified your email address, click on the \"submit\" or \"complete registration\" button.\n" +
                                "\n" +
                                "Log in to the app: After completing the registration process, you should be able to log in to the app using the email address and password you provided.";
                    case "Features":
                        return "A staff monitoring system is a software application or platform that enables employers to track the activities of their employees, including their work hours, productivity, and online activities. Some of the common features of staff monitoring systems include:\n" +
                                "\n" +
                                "Time tracking: A staff monitoring system allows employers to track the work hours of their employees. This feature may include time clocks, timesheets, and other tools that record the start and end times of work shifts.\n" +
                                "\n" +
                                "Productivity tracking: Employers can use staff monitoring systems to track the productivity of their employees. This feature may include tools that measure how much work is completed in a given time period, as well as tools that measure the quality of work.\n" +
                                "\n" +
                                "Screenshots and screen recording: Some staff monitoring systems allow employers to take screenshots or record the screens of their employees' computers to monitor their activities.\n" +
                                "\n" +
                                "Internet activity tracking: Employers can use staff monitoring systems to track the websites that their employees visit and the applications that they use on their computers.\n" +
                                "\n" +
                                "Email monitoring: Some staff monitoring systems allow employers to monitor the email communications of their employees.\n" +
                                "\n" +
                                "Mobile monitoring: Some staff monitoring systems allow employers to track the location of their employees using GPS and monitor their activities on mobile devices.\n" +
                                "\n" +
                                "Reports and analytics: Staff monitoring systems often generate reports and analytics that provide employers with insights into the activities of their employees, such as the amount of time spent on different tasks, the most frequently used applications, and the most visited websites.";
                    case "Settings":
                        return "The settings for location and external data read access can vary depending on the device, operating system, and app you are using. However, here are some general steps you can follow to manage these settings:\n" +
                                "\n" +
                                "Location Access:\n" +
                                "On an Android device, go to Settings > Location and toggle the switch to enable or disable location access for apps.\n" +
                                "On an iOS device, go to Settings > Privacy > Location Services and toggle the switch to enable or disable location access for apps.\n" +
                                "External Data Read Access:\n" +
                                "On an Android device, go to Settings > Apps and select the app you want to manage. Scroll down and select \"Permissions\" and then toggle the switch to enable or disable access to external data.\n" +
                                "On an iOS device, go to Settings > Privacy > select the type of data you want to manage (such as Contacts or Photos) and then toggle the switch to enable or disable access to external data for apps.\n";
                    case "Troubleshooting":
                        return "This is the troubleshooting content";
                    case "FAQs":
                        return "General questions: Start with general questions about the product, service, or topic that users may have. For example, \"What is the product?\" \"How does it work?\" \"Who is it for?\"\n" +
                                "\n" +
                                "Technical questions: Include technical questions that users may have about the product, service, or topic. For example, \"What are the system requirements?\" \"How do I troubleshoot issues?\" \"What is the installation process?\"\n" +
                                "\n" +
                                "Payment and billing questions: If your product or service involves payment and billing, include questions and answers related to this topic. For example, \"What are the pricing options?\" \"How do I cancel my subscription?\" \"How do I update my payment information?\"\n" +
                                "\n" +
                                "Support and contact questions: Provide information on how users can get help and support. For example, \"How do I contact customer support?\" \"What is the response time for support requests?\" \"Is there a knowledge base or support forum?\"\n" +
                                "\n" +
                                "Other important questions: Include any other important questions and answers that users may have, such as questions about privacy and security, refunds and returns, or product updates and releases.";
                    case "Contact Support":
                        return "Contact support :+9152100106 and Email id :- as2708989@gmail.com";
                    case "Terms of Service and Privacy Policy":
                        return "Terms of Service:\n" +
                                "\n" +
                                "Introduction: Start with an introduction that explains the purpose of the ToS and how it applies to the user.\n" +
                                "\n" +
                                "User responsibilities: Describe the user's responsibilities when using the app, such as following community guidelines, not violating copyright laws, and not sharing inappropriate content.\n" +
                                "\n" +
                                "App ownership: State who owns the app and any intellectual property rights associated with it.\n" +
                                "\n" +
                                "Termination: Explain the circumstances under which the user's access to the app may be terminated, such as violating the ToS or engaging in illegal activity.\n" +
                                "\n" +
                                "Liability: Limit the app developer's liability for damages arising from the use of the app.\n" +
                                "\n" +
                                "Dispute resolution: Explain how disputes will be resolved, such as through arbitration or in court.\n" +
                                "\n" +
                                "Privacy Policy:\n" +
                                "\n" +
                                "Introduction: Start with an introduction that explains the purpose of the Privacy Policy and how it applies to the user.\n" +
                                "\n" +
                                "Personal information: Describe the types of personal information the app collects, such as name, email address, and location data.\n" +
                                "\n" +
                                "Use of personal information: Explain how the app will use the personal information, such as for analytics purposes or to provide personalized content.\n" +
                                "\n" +
                                "Sharing of personal information: State whether the app will share personal information with third parties, such as advertisers or service providers.\n" +
                                "\n" +
                                "Security: Explain the measures the app will take to protect personal information from unauthorized access or disclosure.\n" +
                                "\n" +
                                "Opt-out: Explain how users can opt-out of certain data collection or sharing practices.\n" +
                                "\n" +
                                "Changes to the policy: Explain how the app will notify users of changes to the Privacy Policy.";
                    default:
                        return "";
                }


    }
}