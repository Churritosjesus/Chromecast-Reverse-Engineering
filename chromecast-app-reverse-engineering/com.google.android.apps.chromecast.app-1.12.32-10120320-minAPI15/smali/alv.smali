.class public final Lalv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lalv;->b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iput-object p2, p0, Lalv;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 271
    iget-object v0, p0, Lalv;->b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iget-object v1, p0, Lalv;->a:Ljava/lang/String;

    .line 2904
    iget-object v2, v0, Land;->i:Lbdf;

    .line 3247
    iput-object v1, v2, Lbdf;->b:Ljava/lang/String;

    .line 2907
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v2

    iget-object v0, v0, Land;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lalm;->c(Ljava/lang/String;)Laow;

    move-result-object v0

    .line 2908
    if-eqz v0, :cond_0

    .line 3597
    iget-object v2, v0, Laow;->c:Lbdf;

    .line 4247
    iput-object v1, v2, Lbdf;->b:Ljava/lang/String;

    .line 2910
    invoke-virtual {v0}, Laow;->p()V

    .line 272
    :cond_0
    iget-object v0, p0, Lalv;->b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    sget v1, Lb;->do:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 273
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 274
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 279
    iget-object v0, p0, Lalv;->b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 280
    iget-object v0, p0, Lalv;->b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->b(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)Lbhf;

    move-result-object v0

    iget-object v1, p0, Lalv;->b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 4896
    iget-object v1, v1, Land;->i:Lbdf;

    .line 5254
    iget-object v1, v1, Lbdf;->b:Ljava/lang/String;

    .line 280
    invoke-virtual {v0, v1}, Lbhf;->a(Ljava/lang/String;)V

    .line 282
    :cond_0
    return-void
.end method
