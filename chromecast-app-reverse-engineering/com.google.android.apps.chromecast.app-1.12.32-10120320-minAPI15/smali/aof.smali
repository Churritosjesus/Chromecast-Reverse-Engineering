.class final Laof;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Land;


# direct methods
.method constructor <init>(Land;)V
    .locals 0

    .prologue
    .line 1737
    iput-object p1, p0, Laof;->a:Land;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 1737
    check-cast p1, Ljava/lang/String;

    .line 2741
    iget-object v0, p0, Laof;->a:Land;

    invoke-static {v0, p1}, Land;->b(Land;Ljava/lang/String;)V

    .line 2742
    iget-object v0, p0, Laof;->a:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 1737
    return-void
.end method

.method public final b_(I)V
    .locals 2

    .prologue
    .line 1747
    iget-object v0, p0, Laof;->a:Land;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Land;->b(Land;Ljava/lang/String;)V

    .line 1748
    iget-object v0, p0, Laof;->a:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 1749
    return-void
.end method
