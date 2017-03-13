package com.testreel.raikme.iot.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.testreel.raikme.iot.R;
import com.testreel.raikme.iot.fragment.MainFragment;
import com.testreel.raikme.iot.fragment.RuleFragment;
import com.testreel.raikme.iot.fragment.TriggerFragment;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener, RuleFragment.RuleFragmentInteractionListener,
                                                               TriggerFragment.TriggerFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if (fragment == null){
            fragment = new MainFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container, fragment);
            transaction.commit();
        }

    }

    public void loadRuleFragment() {
        RuleFragment ruleFragment = new RuleFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, ruleFragment).addToBackStack(null).commit();
    }

    public void loadMainFragment() {
        MainFragment mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mainFragment).addToBackStack(null).commit();
    }

    public void loadTriggerFragment() {
        TriggerFragment triggerFragment = new TriggerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, triggerFragment).addToBackStack(null).commit();
    }
    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onRuleFragmentInteraction(Uri uri) {

    }

    @Override
    public void onTriggerFragmentInteraction(Uri uri) {

    }
}
