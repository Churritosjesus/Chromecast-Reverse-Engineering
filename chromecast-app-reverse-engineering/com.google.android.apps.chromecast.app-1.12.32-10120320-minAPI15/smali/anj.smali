.class final Lanj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Laoo;

.field private synthetic b:Z

.field private synthetic c:Land;


# direct methods
.method constructor <init>(Land;Laoo;Z)V
    .locals 0

    .prologue
    .line 786
    iput-object p1, p0, Lanj;->c:Land;

    iput-object p2, p0, Lanj;->a:Laoo;

    iput-boolean p3, p0, Lanj;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 789
    iget-object v0, p0, Lanj;->a:Laoo;

    if-eqz v0, :cond_1

    .line 790
    iget-boolean v0, p0, Lanj;->b:Z

    if-eqz v0, :cond_0

    .line 791
    iget-object v0, p0, Lanj;->c:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 793
    :cond_0
    iget-object v0, p0, Lanj;->a:Laoo;

    invoke-interface {v0}, Laoo;->b()V

    .line 795
    :cond_1
    return-void
.end method
