FROM python:3.11-slim
WORKDIR /app 
COPY  . .
ENV APP_ENV = "Production"
ENV DB_URL = "localhost:3306/production_db"
ENV LOG_LEVEL = "Info"
CMD ["python","app.py"]