.class final Lara;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field private synthetic a:Laqy;


# direct methods
.method constructor <init>(Laqy;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lara;->a:Laqy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lara;->a:Laqy;

    invoke-static {v0}, Laqy;->a(Laqy;)Larc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lara;->a:Laqy;

    invoke-static {v0}, Laqy;->a(Laqy;)Larc;

    move-result-object v0

    invoke-interface {v0}, Larc;->p()V

    .line 54
    const/4 v0, 0x1

    .line 56
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
