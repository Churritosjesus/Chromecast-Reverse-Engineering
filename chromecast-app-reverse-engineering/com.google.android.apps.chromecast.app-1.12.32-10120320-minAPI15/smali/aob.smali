.class final Laob;
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
    .line 1563
    iput-object p1, p0, Laob;->a:Land;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 1567
    iget-object v0, p0, Laob;->a:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 1568
    iget-object v0, p0, Laob;->a:Land;

    invoke-static {v0}, Land;->e(Land;)V

    .line 1569
    return-void
.end method
