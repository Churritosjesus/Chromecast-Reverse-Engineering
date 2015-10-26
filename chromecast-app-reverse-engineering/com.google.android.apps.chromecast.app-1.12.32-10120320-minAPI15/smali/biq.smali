.class public final Lbiq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 0

    .prologue
    .line 505
    iput-object p1, p0, Lbiq;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 508
    iget-object v0, p0, Lbiq;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 1680
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    .line 509
    return-void
.end method
