.class final Lan;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lam;


# direct methods
.method constructor <init>(Lam;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lan;->a:Lam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lan;->a:Lam;

    iget-object v0, v0, Lam;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lan;->a:Lam;

    iget-object v1, v1, Lam;->a:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->focusableViewAvailable(Landroid/view/View;)V

    .line 52
    return-void
.end method
