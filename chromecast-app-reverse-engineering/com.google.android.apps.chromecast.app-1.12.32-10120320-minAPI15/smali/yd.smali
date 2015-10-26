.class final Lyd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lyc;


# direct methods
.method constructor <init>(Lyc;)V
    .locals 0

    .prologue
    .line 1060
    iput-object p1, p0, Lyd;->a:Lyc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1063
    iget-object v0, p0, Lyd;->a:Lyc;

    .line 1425
    iget-object v0, v0, Lyc;->g:Landroid/view/View;

    .line 1064
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1065
    iget-object v0, p0, Lyd;->a:Lyc;

    invoke-virtual {v0}, Lyc;->c()V

    .line 1067
    :cond_0
    return-void
.end method
