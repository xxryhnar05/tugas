pindah = 1;
function ga(){
    if(pindah == 1){
        Btn.style.top=400;
        Btn.style.top=300;
        pindah=2;
        }
        else if(pindah == 2){
            Btn.style.top=400;
            Btn.style.top=50;
            pindah=3;
            }
            else if(pindah == 3){
                Btn.style.top=370;
                Btn.style.top=166;
                pindah=1;
                }
                else if(pindah == 4){
                    Btn.style.top=390;
                    Btn.style.top=366;
                    pindah=3;
                    }
                    else if(pindah == 5){
                        Btn.style.top=570;
                        Btn.style.top=266;
                        pindah=2;
                        }
        }