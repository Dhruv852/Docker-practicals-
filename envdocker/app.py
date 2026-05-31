import os

app_env = os.getenv("APP_ENV")
db_url = os.getenv("DB_URL")
log_level = os.getenv("LOG_LEVEL")

print(f"Application environment: {app_env}")
print(f"Database URL: {db_url}")
print(f"Log level: {log_level}")

# --- Step 3: Run the container with the new environment variables ---
# Note: We map container port 80 to host port 8080
print("\nStep 3: Running the container with the new environment variables...")
# The CMD in Dockerfile will execute "python app.py"
# To run this manually: docker run -e APP_ENV=Production -e DB_URL="localhost:3306/prod" -e LOG_LEVEL=Info envapp:v1
print("Run this command to see the output:")
print("docker run -e APP_ENV=Production -e DB_URL='localhost:3306/prod' -e LOG_LEVEL=Info envapp:v1")
print("\nAfter running, use 'docker ps' to see it running.")
print("Then use 'docker logs <container_name>' to see the environment variable output.")