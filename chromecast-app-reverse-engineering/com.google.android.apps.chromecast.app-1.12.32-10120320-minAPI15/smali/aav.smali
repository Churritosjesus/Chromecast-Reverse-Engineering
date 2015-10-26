.class public final Laav;
.super Landroid/widget/BaseAdapter;
.source "PG"

# interfaces
.implements Labs;
.implements Landroid/widget/Filterable;


# instance fields
.field final a:Labw;

.field final b:I

.field public final c:I

.field d:Labj;

.field e:Ljava/util/LinkedHashMap;

.field f:Ljava/util/List;

.field g:Ljava/util/Set;

.field h:Ljava/util/List;

.field i:I

.field public j:Ljava/lang/CharSequence;

.field k:Labr;

.field final l:Laay;

.field m:Labc;

.field private final n:Landroid/content/Context;

.field private final o:Landroid/content/ContentResolver;

.field private p:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 580
    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Laav;-><init>(Landroid/content/Context;II)V

    .line 581
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;II)V
    .locals 2

    .prologue
    .line 595
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 572
    new-instance v0, Laay;

    .line 1554
    invoke-direct {v0, p0}, Laay;-><init>(Laav;)V

    .line 572
    iput-object v0, p0, Laav;->l:Laay;

    .line 596
    iput-object p1, p0, Laav;->n:Landroid/content/Context;

    .line 597
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Laav;->o:Landroid/content/ContentResolver;

    .line 598
    const/16 v0, 0xa

    iput v0, p0, Laav;->c:I

    .line 599
    new-instance v0, Labg;

    iget-object v1, p0, Laav;->o:Landroid/content/ContentResolver;

    invoke-direct {v0, v1}, Labg;-><init>(Landroid/content/ContentResolver;)V

    iput-object v0, p0, Laav;->k:Labr;

    .line 600
    const/4 v0, 0x0

    iput v0, p0, Laav;->b:I

    .line 603
    sget-object v0, Labt;->b:Labw;

    iput-object v0, p0, Laav;->a:Labw;

    .line 610
    return-void
.end method

.method static synthetic a(Laav;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Laav;->n:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Laav;Ljava/lang/CharSequence;ILjava/lang/Long;)Landroid/database/Cursor;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 66
    .line 4932
    iget-object v0, p0, Laav;->n:Landroid/content/Context;

    invoke-static {v0, v3}, Labe;->a(Landroid/content/Context;Ls;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4936
    :goto_0
    return-object v3

    .line 4939
    :cond_0
    iget-object v0, p0, Laav;->a:Labw;

    .line 5098
    iget-object v0, v0, Labw;->b:Landroid/net/Uri;

    .line 4939
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 4940
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "limit"

    add-int/lit8 v2, p2, 0x5

    .line 4942
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 4941
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 4943
    if-eqz p3, :cond_1

    .line 4944
    const-string v0, "directory"

    .line 4945
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 4944
    invoke-virtual {v1, v0, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 4951
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4952
    iget-object v0, p0, Laav;->o:Landroid/content/ContentResolver;

    .line 4953
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Laav;->a:Labw;

    .line 6094
    iget-object v2, v2, Labw;->a:[Ljava/lang/String;

    move-object v4, v3

    move-object v5, v3

    .line 4952
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    .line 4954
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    goto :goto_0
.end method

.method static synthetic a(Laav;Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Laav;->e:Ljava/util/LinkedHashMap;

    return-object p1
.end method

.method static synthetic a(Laav;Ljava/util/LinkedHashMap;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0, p1, p2}, Laav;->a(Ljava/util/LinkedHashMap;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Laav;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Laav;->f:Ljava/util/List;

    return-object p1
.end method

.method public static a(Landroid/content/Context;Landroid/database/Cursor;Landroid/accounts/Account;)Ljava/util/List;
    .locals 11

    .prologue
    const/4 v10, 0x1

    .line 712
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 713
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 714
    const/4 v0, 0x0

    .line 715
    :cond_0
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 716
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    .line 720
    const-wide/16 v8, 0x1

    cmp-long v1, v6, v8

    if-eqz v1, :cond_0

    .line 724
    new-instance v1, Labb;

    invoke-direct {v1}, Labb;-><init>()V

    .line 725
    const/4 v2, 0x4

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 726
    const/4 v2, 0x5

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 727
    iput-wide v6, v1, Labb;->a:J

    .line 728
    const/4 v2, 0x3

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 729
    invoke-interface {p1, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Labb;->c:Ljava/lang/String;

    .line 730
    const/4 v2, 0x2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Labb;->d:Ljava/lang/String;

    .line 731
    if-eqz v5, :cond_1

    if-eqz v8, :cond_1

    .line 734
    :try_start_0
    invoke-virtual {v3, v5}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v2

    .line 735
    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Labb;->b:Ljava/lang/String;

    .line 736
    iget-object v2, v1, Labb;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 737
    const-string v2, "BaseRecipientAdapter"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x2b

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v7, "Cannot resolve directory name: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "@"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 749
    :cond_1
    :goto_1
    if-eqz p2, :cond_2

    iget-object v2, p2, Landroid/accounts/Account;->name:Ljava/lang/String;

    iget-object v5, v1, Labb;->c:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p2, Landroid/accounts/Account;->type:Ljava/lang/String;

    iget-object v5, v1, Labb;->d:Ljava/lang/String;

    .line 750
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v0, v1

    .line 751
    goto/16 :goto_0

    .line 740
    :catch_0
    move-exception v2

    .line 741
    const-string v6, "BaseRecipientAdapter"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, 0x2b

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v9, "Cannot resolve directory name: "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "@"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 753
    :cond_2
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 757
    :cond_3
    if-eqz v0, :cond_4

    .line 758
    invoke-interface {v4, v10, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 761
    :cond_4
    return-object v4
.end method

.method private a(Ljava/util/LinkedHashMap;Ljava/util/List;)Ljava/util/List;
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 857
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 859
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v1, v2

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 860
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 861
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    move v4, v2

    move v3, v1

    .line 862
    :goto_1
    if-ge v4, v7, :cond_0

    .line 863
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lacx;

    .line 864
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 865
    iget-object v8, p0, Laav;->k:Labr;

    invoke-interface {v8, v1, p0}, Labr;->a(Lacx;Labs;)V

    .line 866
    add-int/lit8 v3, v3, 0x1

    .line 862
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_1

    .line 868
    :cond_0
    iget v0, p0, Laav;->c:I

    if-gt v3, v0, :cond_2

    move v1, v3

    .line 871
    goto :goto_0

    :cond_1
    move v3, v1

    .line 872
    :cond_2
    iget v0, p0, Laav;->c:I

    if-gt v3, v0, :cond_3

    .line 873
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lacx;

    .line 874
    iget v2, p0, Laav;->c:I

    if-gt v3, v2, :cond_3

    .line 877
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 878
    iget-object v2, p0, Laav;->k:Labr;

    invoke-interface {v2, v0, p0}, Labr;->a(Lacx;Labs;)V

    .line 879
    add-int/lit8 v3, v3, 0x1

    .line 880
    goto :goto_2

    .line 883
    :cond_3
    return-object v5
.end method

.method static synthetic a(Laav;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Laav;->g:Ljava/util/Set;

    return-object p1
.end method

.method static a(Labd;ZLjava/util/LinkedHashMap;Ljava/util/List;Ljava/util/Set;)V
    .locals 16

    .prologue
    .line 806
    move-object/from16 v0, p0

    iget-object v2, v0, Labd;->b:Ljava/lang/String;

    move-object/from16 v0, p4

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 838
    :goto_0
    return-void

    .line 810
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Labd;->b:Ljava/lang/String;

    move-object/from16 v0, p4

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 812
    if-nez p1, :cond_1

    .line 813
    move-object/from16 v0, p0

    iget-object v2, v0, Labd;->a:Ljava/lang/String;

    move-object/from16 v0, p0

    iget v3, v0, Labd;->i:I

    move-object/from16 v0, p0

    iget-object v4, v0, Labd;->b:Ljava/lang/String;

    move-object/from16 v0, p0

    iget v5, v0, Labd;->c:I

    move-object/from16 v0, p0

    iget-object v6, v0, Labd;->d:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-wide v7, v0, Labd;->e:J

    move-object/from16 v0, p0

    iget-object v9, v0, Labd;->f:Ljava/lang/Long;

    move-object/from16 v0, p0

    iget-wide v10, v0, Labd;->g:J

    move-object/from16 v0, p0

    iget-object v12, v0, Labd;->h:Ljava/lang/String;

    const/4 v13, 0x1

    move-object/from16 v0, p0

    iget-object v14, v0, Labd;->j:Ljava/lang/String;

    invoke-static/range {v2 .. v14}, Lacx;->a(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLjava/lang/String;ZLjava/lang/String;)Lacx;

    move-result-object v2

    move-object/from16 v0, p3

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 819
    :cond_1
    move-object/from16 v0, p0

    iget-wide v2, v0, Labd;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 821
    move-object/from16 v0, p0

    iget-wide v2, v0, Labd;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/util/List;

    .line 822
    move-object/from16 v0, p0

    iget-object v2, v0, Labd;->a:Ljava/lang/String;

    move-object/from16 v0, p0

    iget v3, v0, Labd;->i:I

    move-object/from16 v0, p0

    iget-object v4, v0, Labd;->b:Ljava/lang/String;

    move-object/from16 v0, p0

    iget v5, v0, Labd;->c:I

    move-object/from16 v0, p0

    iget-object v6, v0, Labd;->d:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-wide v7, v0, Labd;->e:J

    move-object/from16 v0, p0

    iget-object v9, v0, Labd;->f:Ljava/lang/Long;

    move-object/from16 v0, p0

    iget-wide v10, v0, Labd;->g:J

    move-object/from16 v0, p0

    iget-object v12, v0, Labd;->h:Ljava/lang/String;

    const/4 v13, 0x1

    move-object/from16 v0, p0

    iget-object v14, v0, Labd;->j:Ljava/lang/String;

    invoke-static/range {v2 .. v14}, Lacx;->b(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLjava/lang/String;ZLjava/lang/String;)Lacx;

    move-result-object v2

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 829
    :cond_2
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 830
    move-object/from16 v0, p0

    iget-object v2, v0, Labd;->a:Ljava/lang/String;

    move-object/from16 v0, p0

    iget v3, v0, Labd;->i:I

    move-object/from16 v0, p0

    iget-object v4, v0, Labd;->b:Ljava/lang/String;

    move-object/from16 v0, p0

    iget v5, v0, Labd;->c:I

    move-object/from16 v0, p0

    iget-object v6, v0, Labd;->d:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-wide v7, v0, Labd;->e:J

    move-object/from16 v0, p0

    iget-object v9, v0, Labd;->f:Ljava/lang/Long;

    move-object/from16 v0, p0

    iget-wide v10, v0, Labd;->g:J

    move-object/from16 v0, p0

    iget-object v12, v0, Labd;->h:Ljava/lang/String;

    const/4 v13, 0x1

    move-object/from16 v0, p0

    iget-object v14, v0, Labd;->j:Ljava/lang/String;

    invoke-static/range {v2 .. v14}, Lacx;->a(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLjava/lang/String;ZLjava/lang/String;)Lacx;

    move-result-object v2

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 836
    move-object/from16 v0, p0

    iget-wide v2, v0, Labd;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v15}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0
.end method

.method static synthetic b(Laav;)Ls;
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic b(Labd;ZLjava/util/LinkedHashMap;Ljava/util/List;Ljava/util/Set;)V
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x1

    invoke-static {p0, v0, p2, p3, p4}, Laav;->a(Labd;ZLjava/util/LinkedHashMap;Ljava/util/List;Ljava/util/Set;)V

    return-void
.end method

.method static synthetic c(Laav;)Laay;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Laav;->l:Laay;

    return-object v0
.end method

.method static synthetic d(Laav;)I
    .locals 2

    .prologue
    .line 66
    iget v0, p0, Laav;->i:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Laav;->i:I

    return v0
.end method

.method static synthetic e(Laav;)I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Laav;->i:I

    return v0
.end method

.method private e()Ljava/util/List;
    .locals 1

    .prologue
    .line 924
    iget-object v0, p0, Laav;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Laav;->h:Ljava/util/List;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Laav;->p:Ljava/util/List;

    goto :goto_0
.end method


# virtual methods
.method public final a(I)Lacx;
    .locals 1

    .prologue
    .line 981
    invoke-direct {p0}, Laav;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lacx;

    return-object v0
.end method

.method protected final a()Ljava/util/List;
    .locals 2

    .prologue
    .line 846
    iget-object v0, p0, Laav;->e:Ljava/util/LinkedHashMap;

    iget-object v1, p0, Laav;->f:Ljava/util/List;

    invoke-direct {p0, v0, v1}, Laav;->a(Ljava/util/LinkedHashMap;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Ljava/util/Set;)Ljava/util/List;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 356
    iget-object v0, p0, Laav;->n:Landroid/content/Context;

    invoke-static {v0, v6}, Labe;->a(Landroid/content/Context;Ls;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, v6

    .line 387
    :cond_0
    :goto_0
    return-object v0

    .line 367
    :cond_1
    iget v0, p0, Laav;->c:I

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    sub-int/2addr v0, v1

    .line 368
    if-lez v0, :cond_3

    .line 376
    :try_start_0
    iget-object v0, p0, Laav;->o:Landroid/content/ContentResolver;

    sget-object v1, Laba;->a:Landroid/net/Uri;

    sget-object v2, Laba;->b:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 379
    iget-object v0, p0, Laav;->n:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Laav;->a(Landroid/content/Context;Landroid/database/Cursor;Landroid/accounts/Account;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 381
    if-eqz v6, :cond_0

    .line 382
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 381
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_2

    .line 382
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0

    :cond_3
    move-object v0, v6

    .line 387
    goto :goto_0
.end method

.method protected final a(II)V
    .locals 1

    .prologue
    .line 910
    if-nez p1, :cond_0

    const/4 v0, 0x1

    if-le p2, v0, :cond_0

    .line 2916
    iget-object v0, p0, Laav;->p:Ljava/util/List;

    iput-object v0, p0, Laav;->h:Ljava/util/List;

    .line 913
    :cond_0
    return-void
.end method

.method public final a(Ljava/util/ArrayList;Laca;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 668
    .line 1613
    iget-object v0, p0, Laav;->n:Landroid/content/Context;

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, v3

    .line 668
    invoke-static/range {v0 .. v5}, Laby;->a(Landroid/content/Context;Laav;Ljava/util/ArrayList;Landroid/accounts/Account;Laca;Ls;)V

    .line 670
    return-void
.end method

.method protected final a(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 897
    iput-object p1, p0, Laav;->p:Ljava/util/List;

    .line 898
    iget-object v0, p0, Laav;->m:Labc;

    invoke-interface {v0, p1}, Labc;->a(Ljava/util/List;)V

    .line 899
    invoke-virtual {p0}, Laav;->notifyDataSetChanged()V

    .line 900
    return-void
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 1022
    return-void
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 1026
    invoke-virtual {p0}, Laav;->notifyDataSetChanged()V

    .line 1027
    return-void
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 1032
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 975
    invoke-direct {p0}, Laav;->e()Ljava/util/List;

    move-result-object v0

    .line 976
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 697
    new-instance v0, Laaw;

    .line 2226
    invoke-direct {v0, p0}, Laaw;-><init>(Laav;)V

    .line 697
    return-object v0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    invoke-virtual {p0, p1}, Laav;->a(I)Lacx;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 986
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .prologue
    .line 996
    invoke-direct {p0}, Laav;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lacx;

    .line 3227
    iget v0, v0, Lacx;->a:I

    .line 996
    return v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 1006
    invoke-direct {p0}, Laav;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lacx;

    .line 1008
    iget-object v0, p0, Laav;->j:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    move-object v6, v7

    .line 1011
    :goto_0
    iget-object v0, p0, Laav;->d:Labj;

    sget v5, Labn;->a:I

    move-object v1, p2

    move-object v2, p3

    move v4, p1

    .line 4108
    invoke-virtual/range {v0 .. v7}, Labj;->a(Landroid/view/View;Landroid/view/ViewGroup;Lacx;IILjava/lang/String;Landroid/graphics/drawable/StateListDrawable;)Landroid/view/View;

    move-result-object v0

    .line 1011
    return-object v0

    .line 1009
    :cond_0
    iget-object v0, p0, Laav;->j:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 991
    const/4 v0, 0x2

    return v0
.end method

.method public final isEnabled(I)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 1001
    invoke-direct {p0}, Laav;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lacx;

    .line 3289
    iget v2, v0, Lacx;->a:I

    if-eqz v2, :cond_0

    iget v0, v0, Lacx;->a:I

    if-ne v0, v1, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    .line 1001
    goto :goto_0
.end method
