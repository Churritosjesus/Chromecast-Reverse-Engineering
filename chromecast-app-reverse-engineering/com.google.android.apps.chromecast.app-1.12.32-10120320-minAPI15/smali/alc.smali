.class final Lalc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lajx;


# instance fields
.field private synthetic a:Lakl;

.field private synthetic b:Lalb;


# direct methods
.method constructor <init>(Lalb;Lakl;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lalc;->b:Lalb;

    iput-object p2, p0, Lalc;->a:Lakl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;Lafq;)V
    .locals 2

    .prologue
    .line 113
    iget-object v0, p0, Lalc;->b:Lalb;

    iget-object v1, p0, Lalc;->a:Lakl;

    invoke-virtual {v0, v1, p1, p2}, Lalb;->a(Lakl;Landroid/os/Bundle;Lafq;)V

    .line 114
    return-void
.end method
