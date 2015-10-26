.class public final Lre;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lvr;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/widget/ActionBarContextView;Lvr;)V
    .locals 0

    .prologue
    .line 219
    iput-object p2, p0, Lre;->a:Lvr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lre;->a:Lvr;

    invoke-virtual {v0}, Lvr;->c()V

    .line 222
    return-void
.end method
