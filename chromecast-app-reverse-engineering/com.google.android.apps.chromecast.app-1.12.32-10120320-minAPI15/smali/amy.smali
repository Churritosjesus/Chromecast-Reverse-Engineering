.class public final Lamy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/MainActivity;


# direct methods
.method constructor <init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V
    .locals 0

    .prologue
    .line 520
    iput-object p1, p0, Lamy;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 523
    iget-object v0, p0, Lamy;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    .line 524
    return-void
.end method
