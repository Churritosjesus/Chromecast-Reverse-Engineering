.class public final Lamv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/MainActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V
    .locals 0

    .prologue
    .line 450
    iput-object p1, p0, Lamv;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lamv;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->d(Lcom/google/android/apps/chromecast/app/MainActivity;)Lbah;

    move-result-object v0

    invoke-virtual {v0}, Lbah;->f()V

    .line 454
    return-void
.end method
