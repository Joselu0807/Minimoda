package es.medac.joseluis.minimoda;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import es.medac.joseluis.minimoda.databinding.ActivityInicioBinding;

public class InicioActivity extends AppCompatActivity {

    private ActivityInicioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializar ViewBinding
        binding = ActivityInicioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}