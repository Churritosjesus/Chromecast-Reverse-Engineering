.class final Laoe;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private synthetic a:Z

.field private synthetic b:Laoo;

.field private synthetic c:Land;


# direct methods
.method constructor <init>(Land;ZLaoo;)V
    .locals 0

    .prologue
    .line 1706
    iput-object p1, p0, Laoe;->c:Land;

    iput-boolean p2, p0, Laoe;->a:Z

    iput-object p3, p0, Laoe;->b:Laoo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 1709
    iget-boolean v0, p0, Laoe;->a:Z

    if-eqz v0, :cond_0

    .line 1710
    iget-object v0, p0, Laoe;->c:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 1712
    :cond_0
    iget-object v0, p0, Laoe;->b:Laoo;

    if-eqz v0, :cond_1

    .line 1713
    iget-object v0, p0, Laoe;->b:Laoo;

    invoke-interface {v0}, Laoo;->b()V

    .line 1715
    :cond_1
    return-void
.end method
