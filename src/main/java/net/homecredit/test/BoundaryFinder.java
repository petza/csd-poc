package net.homecredit.test;

import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.jpa.impl.JPAQuery;
import net.homecredit.csd.domain.Boundary;
import net.homecredit.csd.domain.QBoundary;
import net.homecredit.csd.service.BoundaryService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

/**
 * @author petr.urban on 22.5.2015.
 */

@Component
public class BoundaryFinder {

    private static org.slf4j.Logger LOG = LoggerFactory.getLogger(BoundaryFinder.class);

    @Autowired
    private BoundaryService boundaryService;

    @Autowired
    private EntityManager entityManager;

    public void run() {

        QBoundary qboundary = QBoundary.boundary;

        JPQLQuery query = new JPAQuery(entityManager);

        Boundary boundary = query.from(qboundary).where(qboundary.name.eq("Brno")).uniqueResult(qboundary);


//        Boundary boundary = boundaryService.findOne(BigInteger.TEN);

        Pageable pageable = new PageRequest(0, 20);
        Page<Boundary> page = boundaryService.findAll(pageable);

    }
}
