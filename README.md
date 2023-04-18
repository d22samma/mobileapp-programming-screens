
**Rapport**
# Add activity
Skapa en ny tom aktivitet inom mappen app. Detta skapa två filer. En java script fil samt en layout fil inom applikationen.

# Button inside first activity 

```xml
<Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.554"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.588" />
```
# Add data to the intent bundle using extras

```java
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, second_activity.class);
                intent.putExtra("food", "Potato"); // Optional
                intent.putExtra("count", 1); // Optional
                startActivity(intent);

                setContentView(R.layout.activity_second);
                
```

# Add widget to show intent data

```java
        public class second_activity extends AppCompatActivity {
        private TextView collectvalue;
```

```java
        TextView collectvalue = (TextView) findViewById(R.id.textview);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String food = extras.getString("food");
            int count = extras.getInt("count");

            collectvalue.setText(count+ " " + " " +food+ " left");
        }
```

![](Main.png)
_Pic of Main_Page_

![](Second.png)
_Pic of Second_page_