.class final Lacr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lada;

.field private synthetic b:Lacx;

.field private synthetic c:Lacq;


# direct methods
.method constructor <init>(Lacq;Lada;Lacx;)V
    .locals 0

    .prologue
    .line 2926
    iput-object p1, p0, Lacr;->c:Lacq;

    iput-object p2, p0, Lacr;->a:Lada;

    iput-object p3, p0, Lacr;->b:Lacx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 2929
    iget-object v0, p0, Lacr;->c:Lacq;

    iget-object v0, v0, Lacq;->a:Lacp;

    iget-object v0, v0, Lacp;->a:Lacb;

    iget-object v1, p0, Lacr;->a:Lada;

    iget-object v2, p0, Lacr;->b:Lacx;

    invoke-virtual {v0, v1, v2}, Lacb;->a(Lada;Lacx;)V

    .line 2930
    return-void
.end method
