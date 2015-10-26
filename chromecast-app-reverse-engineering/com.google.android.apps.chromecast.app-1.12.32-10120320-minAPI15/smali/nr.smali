.class final Lnr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lsh;


# instance fields
.field private synthetic a:Lno;


# direct methods
.method constructor <init>(Lno;)V
    .locals 0

    .prologue
    .line 353
    iput-object p1, p0, Lnr;->a:Lno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    .line 356
    iget-object v0, p0, Lnr;->a:Lno;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    invoke-static {v0, v1}, Lno;->b(Lno;I)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 357
    return-void
.end method
