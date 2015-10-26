.class public Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivity;
.super Landroid/preference/PreferenceActivity;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 29
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    invoke-static {p0}, Lblx;->g(Landroid/app/Activity;)V

    .line 32
    sget v0, La;->hl:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivity;->addPreferencesFromResource(I)V

    .line 34
    const-string v0, "privacy_link"

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 35
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 36
    invoke-static {p0}, Lblx;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setIntent(Landroid/content/Intent;)V

    .line 38
    const-string v0, "software_version"

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 39
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 40
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 44
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 50
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    .line 46
    :pswitch_0
    sget-object v0, Lana;->a:Lana;

    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Landroid/content/Context;Lana;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivity;->startActivity(Landroid/content/Intent;)V

    .line 48
    const/4 v0, 0x1

    goto :goto_0

    .line 44
    nop

    :pswitch_data_0
    .packed-switch 0x102002c
        :pswitch_0
    .end packed-switch
.end method
