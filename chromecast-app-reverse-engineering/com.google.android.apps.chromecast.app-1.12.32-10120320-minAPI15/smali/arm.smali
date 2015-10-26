.class final Larm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lark;


# direct methods
.method constructor <init>(Lark;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Larm;->a:Lark;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Larm;->a:Lark;

    .line 1167
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li;->a(Z)V

    .line 152
    return-void
.end method
