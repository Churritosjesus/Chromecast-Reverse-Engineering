.class final Lamu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lams;


# direct methods
.method constructor <init>(Lams;)V
    .locals 0

    .prologue
    .line 440
    iput-object p1, p0, Lamu;->a:Lams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lamu;->a:Lams;

    iget-object v0, v0, Lams;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->d(Lcom/google/android/apps/chromecast/app/MainActivity;)Lbah;

    move-result-object v0

    invoke-virtual {v0}, Lbah;->f()V

    .line 444
    return-void
.end method
