.class final Lblt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field private synthetic a:Lblu;


# direct methods
.method constructor <init>(Lblu;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lblt;->a:Lblu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lblt;->a:Lblu;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lblt;->a:Lblu;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lblu;->a(Z)V

    .line 68
    :cond_0
    return-void
.end method
