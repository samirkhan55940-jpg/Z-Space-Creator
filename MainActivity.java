// Z-System Activation Logic
public void activateZSystem() {
    try {
        // 1. Z-Space pocket ko verify karna
        Runtime.getRuntime().exec("sh /data/local/tmp/Z-Start-Final.sh");
        
        // 2. Gemini Offline AI se baat karna
        displayStatus("GEMINI IS NOW LIVE IN CPU");
    } catch (Exception e) {
        displayStatus("Error: Space Not Found");
    }
}
