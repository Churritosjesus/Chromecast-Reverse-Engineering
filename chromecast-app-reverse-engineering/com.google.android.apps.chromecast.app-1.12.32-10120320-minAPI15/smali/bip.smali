.class public final Lbip;
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
    .line 468
    iput-object p1, p0, Lbip;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 471
    iget-object v0, p0, Lbip;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 472
    iget-object v0, p0, Lbip;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y()V

    .line 473
    iget-object v0, p0, Lbip;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->g(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 474
    iget-object v0, p0, Lbip;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    sget v1, Lbjo;->b:I

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(I)V

    .line 477
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 482
    return-void
.end method
