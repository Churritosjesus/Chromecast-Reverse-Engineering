.class public final Lbio;
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
    .line 445
    iput-object p1, p0, Lbio;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 448
    iget-object v0, p0, Lbio;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->d(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    .line 449
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lbio;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 454
    iget-object v0, p0, Lbio;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y()V

    .line 456
    iget-object v0, p0, Lbio;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 1680
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    .line 458
    :cond_0
    return-void
.end method
