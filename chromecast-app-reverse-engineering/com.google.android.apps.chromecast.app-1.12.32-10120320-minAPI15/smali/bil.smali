.class public final Lbil;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 0

    .prologue
    .line 414
    iput-object p1, p0, Lbil;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 418
    iget-object v0, p0, Lbil;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Laph;

    move-result-object v0

    iget-object v1, p0, Lbil;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 2915
    iget-object v1, v1, Land;->i:Lbdf;

    .line 418
    iget-object v2, p0, Lbil;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    iget-object v2, v2, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    instance-of v2, v2, Lava;

    invoke-virtual {v0, v1, v2}, Laph;->a(Lbdf;Z)Laph;

    .line 420
    iget-object v0, p0, Lbil;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->b(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    .line 421
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 425
    iget-object v0, p0, Lbil;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->c(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 426
    iget-object v0, p0, Lbil;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y()V

    .line 428
    iget-object v0, p0, Lbil;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 3680
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    .line 430
    :cond_0
    return-void
.end method
