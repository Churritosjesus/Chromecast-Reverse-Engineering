.class final Laoa;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Land;


# direct methods
.method constructor <init>(Land;)V
    .locals 0

    .prologue
    .line 1572
    iput-object p1, p0, Laoa;->a:Land;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 1576
    iget-object v0, p0, Laoa;->a:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 1577
    iget-object v0, p0, Laoa;->a:Land;

    invoke-static {v0}, Land;->g(Land;)Laop;

    move-result-object v0

    invoke-interface {v0}, Laop;->b()V

    .line 1578
    return-void
.end method
