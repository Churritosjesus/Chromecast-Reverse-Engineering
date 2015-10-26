.class final Lbja;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field private synthetic a:Lbiy;


# direct methods
.method constructor <init>(Lbiy;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lbja;->a:Lbiy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lbja;->a:Lbiy;

    invoke-static {v0}, Lbiy;->a(Lbiy;)Lbjd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lbja;->a:Lbiy;

    invoke-static {v0}, Lbiy;->c(Lbiy;)Lblp;

    .line 124
    iget-object v0, p0, Lbja;->a:Lbiy;

    invoke-static {v0}, Lbiy;->a(Lbiy;)Lbjd;

    move-result-object v0

    invoke-interface {v0}, Lbjd;->h()V

    .line 126
    :cond_0
    return-void
.end method
