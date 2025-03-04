def cloneRepo(String url, String branch) {
    echo "Cloning the repository from ${url} (Branch: ${branch})"
    
    sh "whoami"  // Debugging step to verify user permissions
    
    try {
        git url: "${url}", branch: "${branch}"
        echo "Code cloned successfully."
    } catch (Exception e) {
        echo "❌ Failed to clone repository: ${e.message}"
        error "Stopping pipeline due to Git clone failure!"
    }
}
