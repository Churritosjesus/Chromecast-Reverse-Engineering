.class final Lawx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ldbi;

.field private synthetic b:Laww;


# direct methods
.method constructor <init>(Laww;Ldbi;)V
    .locals 0

    .prologue
    .line 269
    iput-object p1, p0, Lawx;->b:Laww;

    iput-object p2, p0, Lawx;->a:Ldbi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 272
    iget-object v0, p0, Lawx;->b:Laww;

    iget-object v0, v0, Laww;->a:Lawr;

    iget-object v1, p0, Lawx;->a:Ldbi;

    iget-object v1, v1, Ldbi;->a:Ldbb;

    invoke-static {v0, v1}, Lawr;->a(Lawr;Ldbb;)V

    .line 273
    return-void
.end method
