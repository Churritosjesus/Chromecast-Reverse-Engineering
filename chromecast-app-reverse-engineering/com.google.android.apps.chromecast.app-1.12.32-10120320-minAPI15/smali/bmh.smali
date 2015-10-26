.class final Lbmh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Lbmg;


# direct methods
.method constructor <init>(Lbmg;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lbmh;->a:Lbmg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 69
    iget-object v0, p0, Lbmh;->a:Lbmg;

    invoke-static {v0}, Lbmg;->a(Lbmg;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 70
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lbmh;->a:Lbmg;

    invoke-static {v1}, Lbmg;->b(Lbmg;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 71
    iget-object v1, p0, Lbmh;->a:Lbmg;

    invoke-static {v1}, Lbmg;->c(Lbmg;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v1

    .line 1263
    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1264
    iget-object v2, v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    invoke-virtual {v2, v0}, Lbhf;->a(Ljava/lang/String;)V

    .line 1266
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1267
    const-string v3, "friendly_name"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1268
    new-instance v3, Lalv;

    invoke-direct {v3, v1, v0}, Lalv;-><init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;Ljava/lang/String;)V

    const/16 v0, 0x25

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 73
    :cond_1
    return-void
.end method
