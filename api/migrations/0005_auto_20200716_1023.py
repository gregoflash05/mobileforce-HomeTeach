# Generated by Django 3.0.8 on 2020-07-16 09:23

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('api', '0004_auto_20200716_1015'),
    ]

    operations = [
        migrations.RenameField(
            model_name='days',
            old_name='day_end',
            new_name='end',
        ),
        migrations.RenameField(
            model_name='days',
            old_name='day_start',
            new_name='start',
        ),
    ]
