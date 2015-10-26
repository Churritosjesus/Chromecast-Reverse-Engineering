.class final Lawq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lawn;


# direct methods
.method constructor <init>(Lawn;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lawq;->a:Lawn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 84
    iget-object v0, p0, Lawq;->a:Lawn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lawn;->a(Lawn;Z)Z

    .line 85
    iget-object v0, p0, Lawq;->a:Lawn;

    invoke-static {v0}, Lawn;->a(Lawn;)Laxd;

    move-result-object v0

    invoke-virtual {v0}, Laxd;->a()V

    .line 86
    iget-object v0, p0, Lawq;->a:Lawn;

    invoke-static {v0}, Lawn;->a(Lawn;)Laxd;

    move-result-object v0

    invoke-virtual {v0}, Laxd;->b()V

    .line 87
    iget-object v0, p0, Lawq;->a:Lawn;

    invoke-static {v0}, Lawn;->b(Lawn;)V

    .line 88
    return-void
.end method
