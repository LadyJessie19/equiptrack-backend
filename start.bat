@echo off
echo Iniciando o EquipTrack-Lite Backend (Quarkus) em modo de desenvolvimento...
echo Testes continuos desabilitados para foco no CRUD.
call mvnw quarkus:dev -Dquarkus.test.continuous-testing=disabled
pause