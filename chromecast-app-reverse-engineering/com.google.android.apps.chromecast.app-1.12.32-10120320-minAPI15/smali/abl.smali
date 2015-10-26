.class final Labl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Labj;


# direct methods
.method constructor <init>(Labj;)V
    .locals 0

    .prologue
    .line 329
    iput-object p1, p0, Labl;->a:Labj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Labl;->a:Labj;

    .line 1036
    iget-object v0, v0, Labj;->b:Labp;

    .line 332
    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Labl;->a:Labj;

    .line 2036
    iget-object v0, v0, Labj;->b:Labp;

    .line 333
    invoke-interface {v0}, Labp;->b()V

    .line 335
    :cond_0
    return-void
.end method
