Добавление переменных окружения локально:  
nano .bashrc, ctrl+x, y, enter, source .bashrc  
Добавление переменных окружения системно:  
sudo gedit /etc/profile, save, source /etc/profile  

Требуется контейнер с postgres:  
docker run --name pg -p 5432:5432 -e POSTGRES_PASSWORD=123 -d postgres:12.4-alpine  

параметры подключения к контейнеру:  
url - jdbc:postgresql://localhost:5432/postgres?currentSchema=public  
user - postgres  
password - 123  

