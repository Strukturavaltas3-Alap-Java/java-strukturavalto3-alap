create table fifa_world_cup(
                               id bigint auto_increment,
                               date_of_game date,
                               place_of_game varchar(255),
                               first_team varchar(255),
                               second_team varchar(255),
                               first_team_score bigint,
                               second_team_score bigint,
                               constraint pk_movies primary key (id)
)